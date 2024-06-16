[Winget](https://aka.ms/getwinget)

[GCC](https://github.com/mmozeiko/build-gcc-mingw/releases)

[PHP](https://windows.php.net/download)

[MySQL](https://dev.mysql.com)

[alo]() :https//jkmk

[ok](https://github.com/VTUY23/test/edit/main/README.md)
<!--
GCC: {set uri=https://github.com/mmozeiko/build-gcc-mingw/releases&for /f tokens^=^6^ delims^=^" %%f in ('curl -L -s -H "Cache-Control: no-cache" -H "Pragma: no-cache" %uri%/latest ^| find "expanded_"') do for /f tokens^=^2^ delims^=^" %%a in ('curl -s %%f ^| find "href" ^| find /v "tag"') do echo %uri%%%a}
PHP: {set uri=https://windows.php.net&for /f tokens^=2^ delims^=^" %%f in ('curl -L -s -H "Cache-Control: no-cache" -H "Pragma: no-cache" %uri%/download ^| find "releases/php" ^| findstr /i win ^| findstr /v pack') do echo %%f}
MySQL: {set uri=https://dev.mysql.com&for /f tokens^=4^ delims^=^=^& %%f in ('curl -L -s -H "Cache-Control: no-cache" -H "Pragma: no-cache" %uri%/downloads/mysql/ ^| find "file="') do echo %%f} 
ok:{hello}
-->

[ok]:https://en.opensuse.org/openSUSE:Libzypp_satsolver
