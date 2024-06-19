[Winget](https://aka.ms/getwinget)

[GCC](https://github.com/mmozeiko/build-gcc-mingw/releases)

[PHP](https://windows.php.net/download)

[MySQL](https://dev.mysql.com)

[alo]() :https//jkmk

[ok](https://github.com/VTUY23/test/edit/main/README.md)
<!--
GCC: {for /f tokens^=^6^ delims^=^" %f in ('curl -s -L https://github.com/mmozeiko/build-gcc-mingw/releases/latest ^| find "expanded_"') do for /f tokens^=^2^ delims^=^" %a in ('curl -s -L %f ^| find "href" ^| find /v "tag"') do echo https://github.com%a}
PHP: {for /f tokens^=3^ delims^=^"^# %f in ('curl -s -L https://www.php.net/downloads.php ^| find "changelog" ^| findstr /n "^" ^| findstr "^1:"') do for /f tokens^=2^ delims^=^" %a in ('curl -s -L https://windows.php.net/download ^| find "%f" ^| findstr /i win ^| findstr /v pack') do echo https://windows.php.net%a}
MySQL: {for /f tokens^=4^ delims^=^=^& %f in ('curl -s -L https://dev.mysql.com/downloads/mysql/ ^| find "file="') do echo https://dev.mysql.com/get/%f} 
ok:{hello}
-->

[ok]:https://en.opensuse.org/openSUSE:Libzypp_satsolver
