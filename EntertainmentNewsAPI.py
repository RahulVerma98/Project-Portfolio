#This module was written by Rahul Verma
import requests 

# https://newsapi.org/


def mtvAPI():
    mtv_news = requests.get("https://newsapi.org/v2/top-headlines?sources=mtv-news&apiKey=01dff295c83e4b2da79345b4cb2e1175").json()
    json_status = mtv_news['status']
    print(json_status)  
    for x in range(0, 5):
      print("")
      print("########################################")
      print(str(x+1) +". " + mtv_news['articles'][x]['title'].upper())
      print("")
      print(mtv_news['articles'][x]['description'])
      print("")
      print(mtv_news['articles'][x]['url'])
      print("")
              

def lad_bibleAPI():
  lad_bible = requests.get("https://newsapi.org/v2/top-headlines?sources=the-lad-bible&apiKey=01dff295c83e4b2da79345b4cb2e1175").json()
  json_status = lad_bible['status']
  for x in range(0,5):
    print("")
    print("##########################################")
    print(str(x+1) + ". " + lad_bible['articles'][x]['title'].upper())
    print("")
    print(lad_bible['articles'][x]['description'])
    print("")
    print(lad_bible['articles'][x]['url'])
    print("")


    
def buzzfeedAPI():
  buzzfeed = requests.get("https://newsapi.org/v2/top-headlines?sources=buzzfeed&apiKey=01dff295c83e4b2da79345b4cb2e1175").json()
  json_status = buzzfeed['status']
  for x in range(0,5):
    print("")
    print("##########################################")
    print(str(x+1) + ". " + buzzfeed['articles'][x]['title'].upper())
    print("")
    print(buzzfeed['articles'][x]['description'])
    print("")
    print(buzzfeed['articles'][x]['url'])
    print("")
    
def ent_menu():
    print("###### ENTERTAIMENT NEWS ######")
    print("1. MTV News")
    print("2. Lad Bible News")
    print("3. BuzzFeed News")
    print("###############################")
    print("")
    menu = input("Enter News Number: ")
    if menu == 1:
        mtvAPI()
    elif menu == 2:
        lad_bibleAPI()
    elif menu == 3:
        buzzfeedAPI()
    else:
        ent_menu()
        
        
ent_menu()
