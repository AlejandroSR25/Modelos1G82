from tkinter import *
import os
from PIL import Image, ImageTk


class ImgRelativeLoad:
    @staticmethod
    def loadRelImages(relativepath, resizex, resizey):

        directory_path = os.path.dirname(__file__)
        file_path = os.path.join(directory_path, relativepath)
        img = Image.open(file_path.replace(
            '\\', "/")).resize((resizex, resizey))
        img = ImageTk.PhotoImage(
            img)
        return img
