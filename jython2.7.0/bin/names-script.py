#!C:\jython2.7.0\bin\jython.exe
# EASY-INSTALL-ENTRY-SCRIPT: 'names==0.3.0','console_scripts','names'
__requires__ = 'names==0.3.0'
import sys
from pkg_resources import load_entry_point

if __name__ == '__main__':
    sys.exit(
        load_entry_point('names==0.3.0', 'console_scripts', 'names')()
    )
