from abc import ABC, abstractmethod
from Personajes import *


class Creador(ABC):
    def crear_personaje(self):
        return self.factory_method()

    @abstractmethod
    def factory_method(self):
        pass


class CreadorHumano(Creador):
    def factory_method(self):
        return Humano()

class CreadorElfo(Creador):
    def factory_method(self):
        return Elfo()

class CreadorEnano(Creador):
    def factory_method(self):
        return Enano()

class CreadorOrco(Creador):
    def factory_method(self):
        return Orco()

class CreadorHobbit(Creador):
    def factory_method(self):
        return Hobbit()