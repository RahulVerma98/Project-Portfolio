#This module was written by Rahul Verma
import requests

#http://www.omdbapi.com/?i=tt3896198&apikey=3860d6cd
#http://www.omdbapi.com/

def movie_tvSE(): # Movie And Tv Shows Search Engine 
    Movie_name = input("Enter Movie/TV Shows: ").lower()
    sent = Movie_name.split("'")
    mylist= sent
    mylist[0] = mylist[0].replace(' ', '+')

    
    request = requests.get("http://www.omdbapi.com/?t=" + mylist[0] +"&apikey=3860d6cd").json()
    print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
    print("Title: " + request["Title"])
    print("")
    print("Years:" + request["Year"])
    print("")
    print("Actors: " + request["Actors"])
    print("")
    print("Story: " + request["Plot"])
    print("")
    print("Genre: " + request["Genre"])
    print("")
    print("IMDB Ratyings: " + request["imdbRating"])
    print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

while True:
    movie_tvSE()
