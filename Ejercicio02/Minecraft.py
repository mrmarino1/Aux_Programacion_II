class ServidorMinecraft():
    def __init__(self):
        self.__max = 10
        self.__jugadores = {}

    def Agregar(self, nombre, diamantes):
        if len(self.__jugadores) < self.__max:
            self.__jugadores[nombre] = diamantes
            print(f"El jugador {nombre} agregado con {diamantes} diamantes")
        else:
            print("El servidor esta lleno")
        
    def Stacks(self):
        for nombre, diamantes in self.__jugadores.items():
            stacks = diamantes // 64
            print(f"{nombre} tiene {stacks} stack's de diamantes")
        
    def ConDiamantes(self):
        if self.__jugadores:
            jugador = max(self.__jugadores, key = self.__jugadores.get)
            print(f"Jugador con mas diamantes: {jugador} con {self.__jugadores[jugador]} diamantes")
        
    def Total(self):
        total = sum(self.__jugadores.values())
        print(f"Total de diamantes en el servidor: {total}")
    
class Main:
    server = ServidorMinecraft()
    
    server.Agregar("TTarvey", 125)
    server.Agregar("fazelmerow", 65)
    server.Agregar("Beluqy", 25)
    server.Agregar("Steve", 325)

    server.Stacks()
    server.ConDiamantes()
    server.Total()