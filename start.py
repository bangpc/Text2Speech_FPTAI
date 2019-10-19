# -*- coding: utf-8 -*-
"""
Created on Sat Oct  5 10:50:36 2019

@author: BangPC
"""
import time
import requests
start_time=time.time()
import random

#api_key = "693afc409d684c4e88793868d45761b3"
keys = open('keys.txt', 'r').read().split('\n')
api_key = random.choice(keys)
voice = open('voice.txt','r').read()
speed=open('speed.txt','r').read()
prosody = open('prosody.txt','r').read()
text = open('text.txt','r',encoding="utf-8").read()
print(text)
url = "http://api.openfpt.vn/text2speech/v4?api_key={}&voice={}&speed={}&prosody={}".format(api_key, voice, speed, prosody)
response = requests.post(url, data=text.encode('utf-8'), headers={'voice':voice, 'speed':speed, 'prosody':prosody})
response = response.json()
print(response)
link = response['async']
print(link)

print(time.time()-start_time)

file = open("url.txt", "w")
file.write(link);
file.close()

