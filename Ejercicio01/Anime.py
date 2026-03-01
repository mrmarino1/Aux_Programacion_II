class Anime():
    def __init__(self, nombre:str, genero:str, nroEpisodios:int):
        self.nombre = nombre
        self.genero = genero
        self.__nroEpisodios = nroEpisodios
        self.__episodios = []

class Main():
    anime1 = Anime("Death Note","Shonen", 37)
    anime2 = Anime("Berserk", "Seinen", 25)