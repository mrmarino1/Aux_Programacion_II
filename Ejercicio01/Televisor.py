class Televisor():
    def __init__(self, marca:str, resolucion:int, tipo:str):
        self.__marca = marca
        self.__resolucion = resolucion
        opc = ["oled", "ips"]
        if tipo in opc:
            self.__tipo = tipo
        else:
            self.__tipo = "etc"
    
    def toString(self):
        return "Televisor: Marca: "+self.__marca+", Resolución: "+str(self.__resolucion)+"p, Tipo: "+self.__tipo

class Main():  
    tv1 = Televisor("Samsung", 44, "oled")
    print(tv1.toString())

    tv2 = Televisor("Skyworth", 50, "ips")
    print(tv2.toString())