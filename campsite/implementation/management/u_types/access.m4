B_HTML
B_DATABASE

CHECK_BASIC_ACCESS
CHECK_ACCESS({ManageUserTypes})

B_HEAD
	X_EXPIRES
	X_TITLE({Change User Type Permissions})
<!sql if $access == 0>dnl
	X_AD({You do not have the right to change user type permissions.})
<!sql endif>dnl
E_HEAD

<!sql if $access>dnl
B_STYLE
E_STYLE

B_BODY

B_HEADER({Change User Type Permissions})
B_HEADER_BUTTONS
X_HBUTTON({User Types}, {u_types/})
X_HBUTTON({Home}, {home.xql})
X_HBUTTON({Logout}, {logout.xql})
E_HEADER_BUTTONS
E_HEADER

<P>
<!sql setdefault UType 0>dnl
<!sql set NUM_ROWS 0>
<!sql query "SELECT * FROM UserTypes WHERE Name='?UType'" uperm>dnl
<!sql if $NUM_ROWS>
B_DIALOG({Change user type permissions}, {POST}, {do_access.xql})
	B_DIALOG_INPUT({Name:})
		<INPUT TYPE="TEXT" NAME="cName" VALUE="<!sql print ~uperm.Name>" SIZE="32" MAXLENGTH="32">
	E_DIALOG_INPUT
	B_DIALOG_PACKEDINPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cReader"<!sql if @uperm.Reader == "Y"> CHECKED<!sql endif>>})
		User is a reader
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManagePub"<!sql if @uperm.ManagePub == "Y"> CHECKED<!sql endif>>})
		User may add/change publications
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeletePub"<!sql if @uperm.DeletePub == "Y"> CHECKED<!sql endif>>})
		User may delete publications
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageIssue"<!sql if @uperm.ManageIssue == "Y"> CHECKED<!sql endif>>})
		User may add/change issues
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteIssue"<!sql if @uperm.DeleteIssue == "Y"> CHECKED<!sql endif>>})
		User may delete issues
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageSection"<!sql if @uperm.ManageSection == "Y"> CHECKED<!sql endif>>})
		User may add/change sections
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteSection"<!sql if @uperm.DeleteSection == "Y"> CHECKED<!sql endif>>})
		User may delete sections
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cAddArticle"<!sql if @uperm.AddArticle == "Y"> CHECKED<!sql endif>>})
		User may add articles
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cChangeArticle"<!sql if @uperm.ChangeArticle == "Y"> CHECKED<!sql endif>>})
		User may change articles
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteArticle"<!sql if @uperm.DeleteArticle == "Y"> CHECKED<!sql endif>>})
		User may delete articles
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cAddImage"<!sql if @uperm.AddImage == "Y"> CHECKED<!sql endif>>})
		User may add images
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cChangeImage"<!sql if @uperm.ChangeImage == "Y"> CHECKED<!sql endif>>})
		User may change images
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteImage"<!sql if @uperm.DeleteImage == "Y"> CHECKED<!sql endif>>})
		User may delete images
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageTempl"<!sql if @uperm.ManageTempl == "Y"> CHECKED<!sql endif>>})
		User may add templates
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteTempl"<!sql if @uperm.DeleteTempl == "Y"> CHECKED<!sql endif>>})
		User may delete templates
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageUsers"<!sql if @uperm.ManageUsers == "Y"> CHECKED<!sql endif>>})
		User may add/change user accounts and passwords
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteUsers"<!sql if @uperm.DeleteUsers == "Y"> CHECKED<!sql endif>>})
		User may delete user accounts
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageSubscriptions"<!sql if @uperm.ManageSubscriptions == "Y"> CHECKED<!sql endif>>})
		User may manage user subscriptions
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageUserTypes"<!sql if @uperm.ManageUserTypes == "Y"> CHECKED<!sql endif>>})
		User may manage account types
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageArticleTypes"<!sql if @uperm.ManageArticleTypes == "Y"> CHECKED<!sql endif>>})
		User may add/change article types
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteArticleTypes"<!sql if @uperm.DeleteArticleTypes == "Y"> CHECKED<!sql endif>>})
		User may delete article types
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageLanguages"<!sql if @uperm.ManageLanguages == "Y"> CHECKED<!sql endif>>})
		User may add languages and manage language information
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteLanguages"<!sql if @uperm.DeleteLanguages == "Y"> CHECKED<!sql endif>>})
		User may delete languages
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageClasses"<!sql if @uperm.ManageClasses == "Y"> CHECKED<!sql endif>>})
		User may manage dictionary classes
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageDictionary"<!sql if @uperm.ManageDictionary == "Y"> CHECKED<!sql endif>>})
		User may add/change dictionary entries
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteDictionary"<!sql if @uperm.DeleteDictionary == "Y"> CHECKED<!sql endif>>})
		User may delete dictionary entries
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cManageCountries"<!sql if @uperm.ManageCountries == "Y"> CHECKED<!sql endif>>})
		User may add/change country names
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cDeleteCountries"<!sql if @uperm.DeleteCountries == "Y"> CHECKED<!sql endif>>})
		User may delete country entries
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cMailNotify"<!sql if @uperm.MailNotify == "Y"> CHECKED<!sql endif>>})
		User will be notified on several events
	E_DIALOG_INPUT
	B_DIALOG_INPUT({<INPUT TYPE="CHECKBOX" NAME="cViewLogs"<!sql if @uperm.ViewLogs == "Y"> CHECKED<!sql endif>>})
		User may view audit logs
	E_DIALOG_INPUT
	E_DIALOG_PACKEDINPUT
	B_DIALOG_BUTTONS
		<INPUT TYPE="HIDDEN" NAME="UType" VALUE="<!sql print ~UType>">
		<INPUT TYPE="IMAGE" SRC="X_ROOT/img/button/save.gif" BORDER="0">
		<A HREF="X_ROOT/u_types/"><IMG SRC="X_ROOT/img/button/cancel.gif" BORDER="0"></A>
	E_DIALOG_BUTTONS
E_DIALOG
<!sql else>dnl
	<LI>No such user type.</LI>
<!sql endif>dnl
<P>

X_HR
X_COPYRIGHT
E_BODY
<!sql endif>dnl

E_DATABASE
E_HTML
