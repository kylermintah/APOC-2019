#!C:\jython2.7.0\bin\jython.exe
# EASY-INSTALL-ENTRY-SCRIPT: 'pyfiglet==0.8.post1','console_scripts','pyfiglet'
__requires__ = 'pyfiglet==0.8.post1'
import sys
from pkg_resources import load_entry_point

if __name__ == '__main__':
    sys.exit(
        load_entry_point('pyfiglet==0.8.post1', 'console_scripts', 'pyfiglet')()
    )
