from abc import ABC, abstractmethod
from Personajes import *


class Creador(ABC):
    def crear_personaje(self):
        return self.factory_method()

    @abstractmethod
    def factory_method(self):
        pass


class CreadorHumano(Creador):
    def factory_method(self, genero):
        return Humano(genero)

class CreadorElfo(Creador):
    def factory_method(self, genero):
        return Elfo(genero)

class CreadorEnano(Creador):
    def factory_method(self, genero):
        return Enano(genero)

class CreadorOrco(Creador):
    def factory_method(self, genero):
        return Orco(genero)

class CreadorHobbit(Creador):
    def factory_method(self, genero):
        return Hobbit(genero)