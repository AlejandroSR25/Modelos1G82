from tkinter import *
import os
from PIL import Image, ImageTk

#Clase hecha para obtener un objeto PhotoImage, ya que al intentarlo de otras formas no se lograba obtener con la ruta correcta
class ImgRelativeLoad:
    @staticmethod
    def loadRelImages(relativepath, resizex, resizey):
        '''Funcion busca las imagenes mediante el directorio que se le pasa y despues la retorna'''
        directory_path = os.path.dirname(__file__)
        file_path = os.path.join(directory_path, relativepath)
        img = Image.open(file_path.replace(
            '\\', "/")).resize((resizex, resizey))
        img = ImageTk.PhotoImage(
            img)
        return img
