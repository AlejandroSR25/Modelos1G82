from copy import deepcopy
from abc import ABC, abstractmethod

class Personaje(ABC):
    @abstractmethod
    def clone(self):
        return deepcopy(self)
    
    @abstractmethod
    def avatarGenero(self):
        pass


class Humano(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
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

class Elfo(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arco.png"
        self.armadura_path = "../Imagenes/Armadura_elfo.jpg"
        self.escudo_path = "../Imagenes/Escudo_elfos.jpg"
        self.montura_path = "../Imagenes/Caballo.jpg"


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

    def avatarGenero(self, genero):
        if genero == 'H':
            return "../Imagenes/Elfo_H.png"
        else:
            return "../Imagenes/Elfo_M.png"

    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)

class Enano(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
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
    
    def avatarGenero(self, genero):
        if genero == 'H':
            return ''
        else:
            return '../Imagenes/Enano_F.png'
    
    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)
class Orco(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
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

    def avatarGenero(self, genero):
        if genero == 'H':
            return ''
        else:
            return ''
    
    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)

class Hobbit(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
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

    def avatarGenero(self, genero):
        if genero == 'H':
            return ''
        else:
            return ''
    
    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)
