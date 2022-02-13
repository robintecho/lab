# -*- coding: utf-8 -*-
"""Untitled2.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/13XPZtgcb4W455R2Tgbn8WMwQBGyzD8Pi
"""

import csv 
import pandas as pd
import requests
import numpy as np
import matplotlib.pyplot as plt

webpage=requests.get("https://www.flipkart.com/audio-video/~cs-wdminh50xp/pr?sid=0pm&collection-tab-name=Truewireless&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&p%5B%5D=facets.rating%255B%255D%3D3%25E2%2598%2585%2B%2526%2Babove&fm=neo%2Fmerchandising&iid=M_c9dafe85-8020-4c47-b902-7f6ca93a77d5_2_372UD5BXDFYS_MC.QO4RRHA1ZB0R&otracker=hp_rich_navigation_4_2.navigationCard.RICH_NAVIGATION_Electronics~Audio~True%2BWireless%2BEarbuds_QO4RRHA1ZB0R&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&cid=QO4RRHA1ZB0R")

webpage

from bs4 import BeautifulSoup

soup = BeautifulSoup(webpage.content,"html.parser")

print(soup.prettify())

names=soup.find_all('a',class_='s1Q9rs')

names

earphone_names=[]
for i in range(0,len(names)):
  earphone_names.append(names[i].get_text())

earphone_names

price=soup.find_all('div', class_='_3I9_wc')

price

price_list=[]
for i in range(0,len(price)):
  price_list.append(price[i].get_text())
price_list

df=pd.DataFrame()

df['names']=earphone_names

df['price']=price_list

df

