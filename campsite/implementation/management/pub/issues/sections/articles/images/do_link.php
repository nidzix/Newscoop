<?php  
require_once($_SERVER['DOCUMENT_ROOT'].'/classes/common.php');
load_common_include_files("$ADMIN_DIR/pub/issues/sections/articles/images");
require_once($_SERVER['DOCUMENT_ROOT'].'/classes/Article.php');
require_once($_SERVER['DOCUMENT_ROOT'].'/classes/Image.php');
require_once($_SERVER['DOCUMENT_ROOT'].'/classes/User.php');
require_once($_SERVER['DOCUMENT_ROOT'].'/classes/Log.php');
require_once($_SERVER['DOCUMENT_ROOT'].'/classes/Input.php');
require_once($_SERVER['DOCUMENT_ROOT']."/$ADMIN_DIR/CampsiteInterface.php");

list($access, $User) = check_basic_access($_REQUEST);
if (!$access) {
	header("Location: /$ADMIN/logout.php");
	exit;
}

$Pub = Input::Get('Pub', 'int', 0);
$Issue = Input::Get('Issue', 'int', 0);
$Section = Input::Get('Section', 'int', 0);
$Language = Input::Get('Language', 'int', 0);
$sLanguage = Input::Get('sLanguage', 'int', 0);
$Article = Input::Get('Article', 'int', 0);
$ImageId = Input::Get('ImageId', 'int', 0);

if (!Input::IsValid()) {
	CampsiteInterface::DisplayError(array('Invalid input: $1', Input::GetErrorString()));
	exit;
}

$articleObj =& new Article($Pub, $Issue, $Section, $sLanguage, $Article);
if (!$articleObj->exists()) {
	CampsiteInterface::DisplayError('Article does not exist.');
	exit;		
}

$imageObj =& new Image($ImageId);
if (!$imageObj->exists()) {
	CampsiteInterface::DisplayError('Image does not exist.');
	exit;	
}

// This file can only be accessed if the user has the right to change articles
// or the user created this article and it hasnt been published yet.
if (!$articleObj->userCanModify($User)) {
	CampsiteInterface::DisplayError("You do not have the right to change this article.  You may only edit your own articles and once submitted an article can only changed by authorized users.");
	exit;		
}

ArticleImage::AddImageToArticle($ImageId, $Article);

$logtext = getGS('Image $1 linked to article $2', $ImageId, $Article); 
Log::Message($logtext, $User->getUserName(), 42);

// Go back to article image list.
header('Location: '.CampsiteInterface::ArticleUrl($articleObj, $Language, 'images/'));
exit;
?>