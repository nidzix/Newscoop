<table width="100%" cellspacing="0" cellpadding="0" border="0">
        <tr>
          <td width="510" bgcolor="#006B24" valign="middle" align="left" style="padding-left: 10px; padding-right: 10px"><p class="datum">{{ $smarty.now|camp_date_format:"%d %M %Y" }}, Belgrade</p></td>
          <td width="1" bgcolor="#FFFFFF"></td>
          <td width="249" bgcolor="#9FD98B" align="left" valign="middle" style="padding-left: 10px; padding-right: 10px">
		  
		  <!-- search box -->
		  
		    <div id="search">
{{ search_form template="search.tpl" submit_button="Search" }}
<span class="text">Search:</span> <span class="search">{{ camp_edit object="search" attribute="keywords" }}</span>
		{{ /search_form }}</div>
</td>
        </tr>
      </table>