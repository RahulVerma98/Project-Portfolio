#This module was written by Rahul Verma
import requests # request module is required.

# https://newsapi.org/


def espnAPI():
    request = requests.get("https://newsapi.org/v1/articles?source=espn&sortBy=top&apiKey=01dff295c83e4b2da79345b4cb2e1175").json() 
    # ^this reads the data within the url above
    json_status = request['status']
    for x in range(0, 5): #for loop implemented to provide the top 5 sports stories 
        print("")
        print("########################################")
        print(str(x+1) +". " + request['articles'][x]['title'].upper())
        print("")
        print(request['articles'][x]['description'])
        print("")
        print(request['articles'][x]['url'])



def bbc_sportsAPI():
    bbc_sports = requests.get("https://newsapi.org/v1/articles?source=bbc-sport&sortBy=top&apiKey=7235bbbb3da84015b4154b00f948c9fd").json()
    print("")
    # ^this reads the data within the url above
    bbc_sports_status = bbc_sports['status']
    print("API Status: " + bbc_sports_status)
    for x in range(0, 5): #for loop implemented to provide the top 5 sports stories 
        print("")
        print("########################################")
        print(str(x+1) +". " + bbc_sports['articles'][x]['title'].upper())
        print("")
        print(bbc_sports['articles'][x]['description'])
        print("")
        print(bbc_sports['articles'][x]['url'])


def sports_BibleAPI():
    sports_bible = requests.get("https://newsapi.org/v1/articles?source=the-sport-bible&sortBy=top&apiKey=01dff295c83e4b2da79345b4cb2e1175").json()
    print("")
    sports_bible_status = sports_bible['status']
    # ^this reads the data within the url above
    print("API Status: " + sports_bible_status)
    for x in range(0, 5): #for loop implemented to provide the top 5 sports stories 
        print("")
        print("########################################")
        print(str(x+1) +". " + sports_bible['articles'][x]['title'].upper())
        print("")
        print(sports_bible['articles'][x]['description'])
        print("")
        print(sports_bible['articles'][x]['url'])



def sports_menu():
    """The Menu where the user chooses the source of the news""" 
    
    print("###### SPORTS NEWS ######")
    print("1. ESPN Sports News")
    print("2. BBC Sports News")
    print("3. Sports Bible News")
    print("#########################")
    print("")
    menu = input("Enter News Number: ")
    if menu == "1":
        espnAPI()
    elif menu == "2":
        bbc_sportsAPI()
    elif menu == "3":
        sports_BibleAPI()
    else:
        sports_menu()
        
        
sports_menu()
