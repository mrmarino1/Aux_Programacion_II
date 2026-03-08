class Bus():
    def __init__(self, capacidad: int):
        self.__capacidad = capacidad
        self.__pasajeros = 0
        self.__precio = 1.5

    def Sube(self, personas):
        if self.__pasajeros + personas <= self.__capacidad:
            self.__pasajeros += personas
            print(f"Subieron {personas} pasajeros")
        else:
            print("No hay espacio")
        
    def Cobrar(self):
        total = self.__pasajeros * self.__precio
        print(f"Total {total} bs.")
    
    def AsientosDisponibles(self):
        disponibles = self.__capacidad - self.__pasajeros
        print(f"Asientos disponibles: {disponibles}")

class Main:
    b1 = Bus(30)

    b1.Sube(13)
    b1.Cobrar()
    b1.AsientosDisponibles()