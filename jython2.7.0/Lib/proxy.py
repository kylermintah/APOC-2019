

from selenium import webdriver
from selenium.webdriver.common.proxy import Proxy
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
from selenium.webdriver.chrome.options import Options
import zipfile,os

def proxy_chrome(PROXY_HOST,PROXY_PORT,PROXY_USER,PROXY_PASS):
    manifest_json = """
            {
                "version": "1.0.0",
                "manifest_version": 2,
                "name": "Chrome Proxy",
                "permissions": [
                    "proxy",
                    "tabs",
                    "unlimitedStorage",
                    "storage",
                    "<all_urls>",
                    "webRequest",
                    "webRequestBlocking"
                ],
                "background": {
                    "scripts": ["background.js"]
                },
                "minimum_chrome_version":"22.0.0"
            }
            """

    background_js = """
    var config = {
            mode: "fixed_servers",
            rules: {
              singleProxy: {
                scheme: "http",
                host: "%(host)s",
                port: parseInt(%(port)d)
              },
              bypassList: ["foobar.com"]
            }
          };
    chrome.proxy.settings.set({value: config, scope: "regular"}, function() {});
    function callbackFn(details) {
        return {
            authCredentials: {
                username: "%(user)s",
                password: "%(pass)s"
            }
        };
    }
    chrome.webRequest.onAuthRequired.addListener(
                callbackFn,
                {urls: ["<all_urls>"]},
                ['blocking']
    );
        """ % {
            "host": PROXY_HOST,
            "port": PROXY_PORT,
            "user": PROXY_USER,
            "pass": PROXY_PASS,
        }


    pluginfile = 'proxy_auth_plugin.zip'

    with zipfile.ZipFile(pluginfile, 'w') as zp:
        zp.writestr("manifest.json", manifest_json)
        zp.writestr("background.js", background_js)

    co = Options()
    #extension support is not possible in incognito mode for now
    #co.add_argument('--incognito')
    co.add_argument('--disable-gpu')
    #disable infobars
    co.add_argument('--disable-infobars')
    co.add_experimental_option("excludeSwitches",["ignore-certificate-errors"])
    print(os.getcwd)
    #location of chromedriver, please change it according to your project.
    chromedriver = os.getcwd()+'\\appPackage\\python\\jython2.7.0\\Lib\\chromedriver_windows'
   # chromedriver = chromedriver(mac)
    co.add_extension(pluginfile)
   # driver = webdriver.Chrome()

    driver = webdriver.Chrome(chromedriver,chrome_options=co)
    #return the driver with added proxy configuration.
    return driver
