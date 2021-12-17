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
        self.arma_path = "../Imagenes/Arma_humano.png"
        self.armadura_path = "../Imagenes/Armadura_humano.png"
        self.escudo_path = "../Imagenes/Escudo_humano.png"
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
            return "../Imagenes/Humano_H.jpg"
        else:
            return "../Imagenes/Humano_M.png"

    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)

class Elfo(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arco.png"
        self.armadura_path = "../Imagenes/Armadura_elfos.jpg"
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
        self.arma_path = "../Imagenes/Arma_enano.png"
        self.armadura_path = "../Imagenes/Armadura_enano.png"
        self.escudo_path = "../Imagenes/Escudo_enano.png"
        self.montura_path = "../Imagenes/Montura_enano.jpg"

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
            return '../Imagenes/Enano_H.png'
        else:
            return '../Imagenes/Enano_M.png'
    
    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)
class Orco(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arma_orco.png"
        self.armadura_path = "../Imagenes/Armadura_orco.png"
        self.escudo_path = "../Imagenes/Escudo_orco.png"
        self.montura_path = "../Imagenes/Montura_orco.png"

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
            return '../Imagenes/Orco_H.png'
        else:
            return '../Imagenes/Orco_M.png'
    
    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)

class Hobbit(Personaje):
    def __init__(self, genero):
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arma_hobbit.png"
        self.armadura_path = "../Imagenes/Armadura_hobbit.png"
        self.escudo_path = "../Imagenes/Escudo_hobbit.png"
        self.montura_path = "../Imagenes/Montura_hobbit.png"

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
            return '../Imagenes/Hobbit_H.png'
        else:
            return '../Imagenes/Hobbit_M.png'
    
    #Metodo Clonacion

    def clone(self):
        return deepcopy(self)
