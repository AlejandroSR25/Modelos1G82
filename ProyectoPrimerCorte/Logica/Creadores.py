from abc import ABC, abstractmethod
from Personajes import *


class Creador(ABC):
'''Clase creador para la fabrica'''
    def crear_personaje(self):
        '''Funcion de crear los personajes'''
        return self.factory_method()

    @abstractmethod
    def factory_method(self):
        '''Metodo abstracto'''
        pass


class CreadorHumano(Creador):
    def factory_method(self, genero):
        '''Funcion de los humanos'''
        return Humano(genero)

class CreadorElfo(Creador):
    def factory_method(self, genero):
        '''Funcion de los elfos'''
        return Elfo(genero)

class CreadorEnano(Creador):
    def factory_method(self, genero):
        '''Funcion de los enanos'''
        return Enano(genero)

class CreadorOrco(Creador):
    def factory_method(self, genero):
        '''Funcion de los orcos'''
        return Orco(genero)

class CreadorHobbit(Creador):
    def factory_method(self, genero):
        '''Funcion de los Hobbit'''
        return Hobbit(genero)
