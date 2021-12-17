from copy import deepcopy
from abc import ABC, abstractmethod

class Personaje(ABC):
    @abstractmethod
    def clone(self):
        '''Funcion para clonar los personajes'''
        return deepcopy(self)
    
    @abstractmethod
    def avatarGenero(self):
        '''Funcion para determinar el genero del personaje'''
        pass


class Humano(Personaje):
    def __init__(self, genero):
        '''Funcion para inicializar el humano'''
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arma_humano.png"
        self.armadura_path = "../Imagenes/Armadura_humano.png"
        self.escudo_path = "../Imagenes/Escudo_humano.png"
        self.montura_path = "../Imagenes/Caballo.jpg"

    #Setters
    def setGenero(self, genero):
        '''Funcion set del atributo'''
        self.genero = genero

    def setAvatarPath(self, avatar_path):
        '''Funcion set del atributo'''
        self.avatar_path = avatar_path

    def setArmaPath(self, arma_path):
        '''Funcion set del atributo'''
        self.arma_path = arma_path
    
    def setArmaduraPath(self, armadura_path):
        '''Funcion set del atributo'''
        self.armadura_path = armadura_path

    def setEscudoPath(self, escudo_path):
        '''Funcion set del atributo'''
        self.escudo_path = escudo_path

    def setMonturaPath(self, montura_path):
        '''Funcion set del atributo'''
        self.montura_path = montura_path

    #Getters

    def getGenero(self):
        '''Funcion get del atributo'''
        return self.genero

    def getAvatarPath(self):
        '''Funcion get del atributo'''
        return self.avatar_path

    def getArmaPath(self):
        '''Funcion get del atributo'''
        return self.arma_path
    
    def getArmaduraPath(self):
        '''Funcion get del atributo'''
        return self.armadura_path

    def getEscudoPath(self):
        '''Funcion get del atributo'''
        return self.escudo_path

    def getMonturaPath(self):
        '''Funcion get del atributo'''
        return self.montura_path    

    def avatarGenero(self, genero):
        '''Funcion para definir la ruta dependiendo del genero'''
        if genero == 'H':
            return "../Imagenes/Humano_H.jpg"
        else:
            return "../Imagenes/Humano_M.png"

    #Metodo Clonacion

    def clone(self):
        '''Funcion para clonar'''
        return deepcopy(self)

class Elfo(Personaje):
    def __init__(self, genero):
        '''Funcion para inicializar el elfo'''
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arco.png"
        self.armadura_path = "../Imagenes/Armadura_elfos.jpg"
        self.escudo_path = "../Imagenes/Escudo_elfos.jpg"
        self.montura_path = "../Imagenes/Caballo.jpg"

    #Setters
    def setGenero(self, genero):
        '''Funcion set para el atributo'''
        self.genero = genero

    def setAvatarPath(self, avatar_path):
        '''Funcion set para el atributo'''
        self.avatar_path = avatar_path

    def setArmaPath(self, arma_path):
        '''Funcion set para el atributo'''
        self.arma_path = arma_path
    
    def setArmaduraPath(self, armadura_path):
        '''Funcion set para el atributo'''
        self.armadura_path = armadura_path

    def setEscudoPath(self, escudo_path):
        '''Funcion set para el atributo'''
        self.escudo_path = escudo_path

    def setMonturaPath(self, montura_path):
        '''Funcion set para el atributo'''
        self.montura_path = montura_path

    #Getters

    def getGenero(self):
        '''Funcion get para el atributo'''
        return self.genero

    def getAvatarPath(self):
        '''Funcion get para el atributo'''
        return self.avatar_path

    def getArmaPath(self):
        '''Funcion get para el atributo'''
        return self.arma_path
    
    def getArmaduraPath(self):
        '''Funcion get para el atributo'''
        return self.armadura_path

    def getEscudoPath(self):
        '''Funcion get para el atributo'''
        return self.escudo_path

    def getMonturaPath(self):
        '''Funcion get para el atributo'''
        return self.montura_path    

    def avatarGenero(self, genero):
        '''Funcion para definir la ruta dependiendo del genero'''
        if genero == 'H':
            return "../Imagenes/Elfo_H.png"
        else:
            return "../Imagenes/Elfo_M.png"

    #Metodo Clonacion

    def clone(self):
        '''Funcion para clonar'''
        return deepcopy(self)

class Enano(Personaje):
    def __init__(self, genero):
        '''Funcion para inicializar el Enano'''
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arma_enano.png"
        self.armadura_path = "../Imagenes/Armadura_enano.png"
        self.escudo_path = "../Imagenes/Escudo_enano.png"
        self.montura_path = "../Imagenes/Montura_enano.jpg"

    #Setters
    def setGenero(self, genero):
        '''Funcion set del atributo'''
        self.genero = genero

    def setAvatarPath(self, avatar_path):
        '''Funcion set del atributo'''
        self.avatar_path = avatar_path

    def setArmaPath(self, arma_path):
        '''Funcion set del atributo'''
        self.arma_path = arma_path
    
    def setArmaduraPath(self, armadura_path):
        '''Funcion set del atributo'''
        self.armadura_path = armadura_path

    def setEscudoPath(self, escudo_path):
        '''Funcion set del atributo'''
        self.escudo_path = escudo_path

    def setMonturaPath(self, montura_path):
        '''Funcion set del atributo'''
        self.montura_path = montura_path

    #Getters

    def getGenero(self):
        '''Funcion get del atributo'''
        return self.genero

    def getAvatarPath(self):
        '''Funcion get del atributo'''
        return self.avatar_path

    def getArmaPath(self):
        '''Funcion get del atributo'''
        return self.arma_path
    
    def getArmaduraPath(self):
        '''Funcion get del atributo'''
        return self.armadura_path

    def getEscudoPath(self):
        '''Funcion get del atributo'''
        return self.escudo_path

    def getMonturaPath(self):
        '''Funcion get del atributo'''
        return self.montura_path    
    
    def avatarGenero(self, genero):
        '''Funcion para definir la ruta dependiendo del genero'''
        if genero == 'H':
            return '../Imagenes/Enano_H.png'
        else:
            return '../Imagenes/Enano_M.png'
    
    #Metodo Clonacion

    def clone(self):
        '''Funcion para clonar'''
        return deepcopy(self)
    
class Orco(Personaje):
    def __init__(self, genero):
        '''Funcion para inicializar el Orco'''
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arma_orco.png"
        self.armadura_path = "../Imagenes/Armadura_orco.png"
        self.escudo_path = "../Imagenes/Escudo_orco.png"
        self.montura_path = "../Imagenes/Montura_orco.png"

    #Setters
    def setGenero(self, genero):
        '''Funcion set del atributo'''
        self.genero = genero

    def setAvatarPath(self, avatar_path):
        '''Funcion set del atributo'''
        self.avatar_path = avatar_path

    def setArmaPath(self, arma_path):
        '''Funcion set del atributo'''
        self.arma_path = arma_path
    
    def setArmaduraPath(self, armadura_path):
        '''Funcion set del atributo'''
        self.armadura_path = armadura_path

    def setEscudoPath(self, escudo_path):
        '''Funcion set del atributo'''
        self.escudo_path = escudo_path

    def setMonturaPath(self, montura_path):
        '''Funcion set del atributo'''
        self.montura_path = montura_path

    #Getters

    def getGenero(self):
        '''Funcion get del atributo'''
        return self.genero

    def getAvatarPath(self):
        '''Funcion get del atributo'''
        return self.avatar_path

    def getArmaPath(self):
        '''Funcion get del atributo'''
        return self.arma_path
    
    def getArmaduraPath(self):
        '''Funcion get del atributo'''
        return self.armadura_path

    def getEscudoPath(self):
        '''Funcion get del atributo'''
        return self.escudo_path

    def getMonturaPath(self):
        '''Funcion get del atributo'''
        return self.montura_path    

    def avatarGenero(self, genero):
        '''Funcion para definir la ruta dependiendo del genero'''
        if genero == 'H':
            return '../Imagenes/Orco_H.png'
        else:
            return '../Imagenes/Orco_M.png'
    
    #Metodo Clonacion

    def clone(self):
        '''Funcion para clonar'''
        return deepcopy(self)

class Hobbit(Personaje):
    def __init__(self, genero):
        '''Funcion para inicializar el Hobbit'''
        self.vida = 100
        self.genero = genero
        self.avatar_path = self.avatarGenero(genero)
        self.arma_path = "../Imagenes/Arma_hobbit.png"
        self.armadura_path = "../Imagenes/Armadura_hobbit.png"
        self.escudo_path = "../Imagenes/Escudo_hobbit.png"
        self.montura_path = "../Imagenes/Montura_hobbit.png"

    #Setters
    def setGenero(self, genero):
        '''Funcion set del atributo'''
        self.genero = genero

    def setAvatarPath(self, avatar_path):
        '''Funcion set del atributo'''
        self.avatar_path = avatar_path

    def setArmaPath(self, arma_path):
        '''Funcion set del atributo'''
        self.arma_path = arma_path
    
    def setArmaduraPath(self, armadura_path):
        '''Funcion set del atributo'''
        self.armadura_path = armadura_path

    def setEscudoPath(self, escudo_path):
        '''Funcion set del atributo'''
        self.escudo_path = escudo_path

    def setMonturaPath(self, montura_path):
        '''Funcion set del atributo'''
        self.montura_path = montura_path

    #Getters

    def getGenero(self):
        '''Funcion get del atributo'''
        return self.genero

    def getAvatarPath(self):
        '''Funcion get del atributo'''
        return self.avatar_path

    def getArmaPath(self):
        '''Funcion get del atributo'''
        return self.arma_path
    
    def getArmaduraPath(self):
        '''Funcion get del atributo'''
        return self.armadura_path

    def getEscudoPath(self):
        '''Funcion get del atributo'''
        return self.escudo_path

    def getMonturaPath(self):
        '''Funcion get del atributo'''
        return self.montura_path    

    def avatarGenero(self, genero):
        '''Funcion para definir la ruta dependiendo del genero'''
        if genero == 'H':
            return '../Imagenes/Hobbit_H.png'
        else:
            return '../Imagenes/Hobbit_M.png'
    
    #Metodo Clonacion

    def clone(self):
        '''Funcion para clonar'''
        return deepcopy(self)
