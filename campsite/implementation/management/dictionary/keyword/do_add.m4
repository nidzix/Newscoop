B_HTML
B_DATABASE

CHECK_BASIC_ACCESS
CHECK_ACCESS({ManageDictionary})

B_HEAD
	X_EXPIRES
	X_TITLE({Adding New Keyword Class})
<!sql if $access == 0>dnl
	X_AD({You do not have the right to add keyword classes.})
<!sql endif>dnl
E_HEAD

<!sql if $access>dnl
B_STYLE
E_STYLE

B_BODY

<!sql setdefault Keyword 0>dnl
<!sql setdefault Language 0>dnl
<!sql setdefault cClass 0>dnl
B_HEADER({Adding New Keyword Class})
B_HEADER_BUTTONS
X_HBUTTON({Keyword Classes}, {dictionary/keyword/?Keyword=<!sql print #Keyword>&Language=<!sql print #Language>})
X_HBUTTON({Dictionary}, {dictionary/})
X_HBUTTON({Home}, {home.xql})
X_HBUTTON({Logout}, {logout.xql})
E_HEADER_BUTTONS
E_HEADER

<!sql query "SELECT Name FROM Languages WHERE Id=?Language" q_lang>dnl
<!sql query "SELECT Name FROM Languages WHERE Id=?Language" q_lang>dnl
B_CURRENT
X_CURRENT({Keyword:}, {<B><!sql print ~q_dict.Keyword></B>})
X_CURRENT({Language}, {<B><!sql print ~q_lang.Name></B>})
E_CURRENT

<!sql set created 0>dnl
<P>
B_MSGBOX({Adding new keyword class})
	X_MSGBOX_TEXT({
<!sql set AFFECTED_ROWS 0>dnl
<!sql if ($cClass != 0)>dnl
<!sql query "INSERT IGNORE INTO KeywordClasses SET IdDictionary=?Keyword, IdClasses=?cClass, IdLanguage=?Language">dnl
<!sql endif>dnl
<!sql if $AFFECTED_ROWS>dnl
		<LI>The keyword class has been added.</LI>
<!sql else>dnl
		<LI>The keyword class could not be added.<LI></LI>Please check if the keyword class does not already exist.</LI>
<!sql endif>dnl
		})
<!sql if $AFFECTED_ROWS>dnl
	B_MSGBOX_BUTTONS
		<A HREF="X_ROOT/dictionary/keyword/add.xql?Keyword=<!sql print #Keyword>&Language=<!sql print #Language>"><IMG SRC="X_ROOT/img/button/add_another.gif" BORDER="0" ALT="Add another keyword class"></A>
		<A HREF="X_ROOT/dictionary/keyword/?Keyword=<!sql print #Keyword>&Language=<!sql print #Language>"><IMG SRC="X_ROOT/img/button/done.gif" BORDER="0" ALT="Done"></A>
	E_MSGBOX_BUTTONS
<!sql else>
	B_MSGBOX_BUTTONS
		<A HREF="X_ROOT/dictionary/keyword/add.xql?Keyword=<!sql print #Keyword>&Language=<!sql print #Language>"><IMG SRC="X_ROOT/img/button/ok.gif" BORDER="0" ALT="OK"></A>
	E_MSGBOX_BUTTONS
<!sql endif>dnl
E_MSGBOX
<P>

X_HR
X_COPYRIGHT
E_BODY
<!sql endif>dnl

E_DATABASE
E_HTML
