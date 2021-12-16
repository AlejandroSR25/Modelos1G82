from copy import deepcopy

class Personaje():
    def __init__(self):
        self.vida = 0
        self.genero = ""
        self.avatar_path = ""
        self.arma_path = ""
        self.armadura_path = ""
        self.escudo_path = ""
        self.montura_path = ""

    #Setters
    def setGenero(self, genero):
        self.genero = genero

    def setAvatarPath(self, avatar_path):
        self.avatar_path = avatar_path

    def setArmaPath(self, arma_path):
        self.arma_path = arma_path
    
    def setArmaduraPath(self, armadura_path):
        self.armadura_path = armadura_path

    def setEscudoPath(self, escudo_path):
        self.escudo_path = escudo_path

    def setMonturaPath(self, montura_path):
        self.montura_path = montura_path

    #Getters

    def getGenero(self):
        return self.genero

    def getAvatarPath(self):
        return self.avatar_path

    def getArmaPath(self):
        return self.arma_path
    
    def getArmaduraPath(self):
        return self.armadura_path

    def getEscudoPath(self):
        return self.escudo_path

    def getMonturaPath(self):
        return self.montura_path    

    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)

class Humano(Personaje):
    pass

class Elfo(Personaje):
    pass

class Enano(Personaje):
    pass

class Orco(Personaje):
    pass

class Hobbit(Personaje):
    pass