from tkinter import *
import tkinter as tk
from tkinter import messagebox, ttk

from PIL import Image, ImageTk
import os, sys
currentdir = os.path.dirname(os.path.realpath(__file__))
parentdir = os.path.dirname(currentdir)
sys.path.append(parentdir)
from Logica.ImgLoadRel import ImgRelativeLoad
from Logica.Creadores import *

class Interfaz():
    def __init__(self):
        self.raiz = Tk()
        self.raiz.geometry('800x600')
        self.raiz.resizable(0, 0)
        self.raiz.configure(bg='white')
        self.raiz.title('AplicaciónPersonajes')

        self.lista_humanos = []
        self.lista_elfos = []
        self.lista_enanos = []
        self.lista_orcos = []
        self.lista_hobbits = []

        self.iniciarWidgets()

    def iniciarWidgets(self):
        # Creacion Notebook
        self.nb = ttk.Notebook(self.raiz)
        self.nb.pack(fill='both', expand='yes')

        # Pestaña creacion personajes
        self.pestaña_creacion = tk.Frame(self.nb, bg="beige")
        self.nb.add(self.pestaña_creacion, text='Crear Personaje')

        # Label titulo
        self.label_titulo = ttk.Label(self.pestaña_creacion, text="Seleccion de Personajes", font=("Heebo", 20, 'bold'), background="beige")
        self.label_titulo.place(
            x=250, y=10, width=310, height=50)

        # Boton Crear
        self.button1 = ttk.Button(self.pestaña_creacion, text="Crear", command= self.crearPersonajes)
        self.button1.place(x=700, y=530, width=50, height=30)

        # Label seleccion raza
        self.label_raza = ttk.Label(self.pestaña_creacion, text="Seleccione la raza", font=("Heebo", 12), background="beige")
        self.label_raza.place(
            x=100, y=70, width=200, height=30)

        # Combobox de razas
        self.sv_raza = StringVar(value="Seleccionar")
        self.combobox1 = ttk.Combobox(self.pestaña_creacion, values=["Humano", "Elfo", "Enano", "Orco", "Hobbit"], state="readonly", textvariable=self.sv_raza)
        self.combobox1.place(x=100, y=100, width=200, height=30)
        self.combobox1.bind("<<ComboboxSelected>>", lambda _: self.actualizarImagenes())

        # ValorRadio
        self.radioValue = StringVar()
        self.radioValue.set("H")

        # Radiobutton Hombre
        self.radio1 = Radiobutton(self.pestaña_creacion, text="H",
                                  variable=self.radioValue, value='H', background="beige", command= self.actualizarImagenes)
        self.radio1.place(x=350, y=100, width=80, height=30)
        # Radiobutton Mujer
        self.radio2 = Radiobutton(self.pestaña_creacion, text="M",
                                  variable=self.radioValue, value="M", background="beige", command= self.actualizarImagenes)
        self.radio2.place(x=450, y=100, width=80, height=30)

        # Label y Spinbox Seleccion numero de personajes a crear
        self.label_numero = tk.Label(
            self.pestaña_creacion, text='Numero a crear:', bg="beige")
        self.label_numero.place(x=550, y=100, width=100, height=30)
        self.valorspin = tk.IntVar()
        self.spinbox_numero = tk.Spinbox(self.pestaña_creacion, from_=1, to=20, bg="beige", state='readonly', wrap='true', textvariable= self.valorspin)
        self.spinbox_numero.place(
            x=650, y=100, width=50, height=30)

        # Label subtitulo personaje
        self.label_personaje = ttk.Label(self.pestaña_creacion, text="Personaje", font=("Heebo", 12), background="beige")
        self.label_personaje.place(
            x=160, y=500, width=75, height=30)

        # Imagen defautl personaje
        self.selectorImagen("..\Imagenes\pj_default.jpg",
                            "Personaje", 150, 300)

        # Label subtitulo escudo
        self.label_escudo = ttk.Label(self.pestaña_creacion, text="Escudo", font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_escudo.place(
            x=360, y=300, width=75, height=30)

        # Imagen default Escudo
        self.selectorImagen(
            "..\Imagenes\Escudo_default.png", "Escudo", 100, 100)

        # Label subtitulo Armadura
        self.label_armadura = ttk.Label(self.pestaña_creacion, text="Armadura", font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_armadura.place(
            x=560, y=300, width=75, height=30)

        # Imagen default Armadura
        self.selectorImagen(
            "..\Imagenes\Armadura_default.png", "Armadura", 100, 100)

        # Label subtitulo Arma
        self.label_arma = ttk.Label(self.pestaña_creacion, text="Arma", font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_arma.place(
            x=360, y=500, width=75, height=30)

        # Imagen default Arma
        self.selectorImagen(
            "..\Imagenes\Arma_default.png", "Arma", 150, 150)

        # Label subtitulo Montura
        self.label_montura = ttk.Label(self.pestaña_creacion, text="Montura", font=("Heebo", 12), background="beige", anchor=CENTER).place(
            x=560, y=500, width=75, height=30)

        # Imagen default montura
        self.selectorImagen(
            "..\Imagenes\montura_default.jpg", "Montura", 150, 150)

        #Pestaña personajes creados
        self.pestaña_inventario = tk.Frame(self.nb, bg="beige")
        self.nb.add(self.pestaña_inventario, text='Inventario de personajes')

        #label titulo
        self.label_titulo_pestaña_2 = ttk.Label(self.pestaña_creacion, text="Seleccion de Personajes", font=("Heebo", 20, 'bold'), background="beige")
        self.label_titulo_pestaña_2.place(x=250, y=10, width=310, height=50)

        # Label subtitulo humanos
        self.label_humano = ttk.Label(self.pestaña_inventario, text=f'Humanos x {len(self.lista_humanos)}', font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_humano.place(
            x=135, y=200, width=120, height=30)

        # Imagen humanos
        self.canv_humano_p2 = Canvas(self.pestaña_inventario, bg='white')
        self.canv_humano_p2.place(x=100, y=40, width=150, height=150)
        self.loadedimage_humano_p2 = ImgRelativeLoad.loadRelImages(
                "../Imagenes/Humano_H.jpg", 100, 125)
        self.canv_humano_p2.create_image(
                85, 75, image=self.loadedimage_humano_p2)

        # Label subtitulo elfos
        self.label_elfo = ttk.Label(self.pestaña_inventario, text=f'Elfos x {len(self.lista_elfos)}', font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_elfo.place(
            x=350, y=200, width=120, height=30)

        # Imagen elfos
        self.canv_elfo_p2 = Canvas(self.pestaña_inventario, bg='white')
        self.canv_elfo_p2.place(x=325, y=40, width=150, height=150)
        self.loadedimage_elfo_p2 = ImgRelativeLoad.loadRelImages(
                "../Imagenes/Elfo_H.png", 125, 150)
        self.canv_elfo_p2.create_image(
                75, 75, image=self.loadedimage_elfo_p2)

        # Label subtitulo Enanos
        self.label_enano = ttk.Label(self.pestaña_inventario, text=f'Enanos x {len(self.lista_enanos)}', font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_enano.place(
            x=575, y=200, width=120, height=30)

        # Imagen Enanos
        self.canv_enano_p2 = Canvas(self.pestaña_inventario, bg='white')
        self.canv_enano_p2.place(x=550, y=40, width=150, height=150)
        self.loadedimage_enano_p2 = ImgRelativeLoad.loadRelImages(
                "../Imagenes/Enano_H.png", 100, 125)
        self.canv_enano_p2.create_image(
                85, 75, image=self.loadedimage_enano_p2)

        # Label subtitulo Orcos
        self.label_orco = ttk.Label(self.pestaña_inventario, text=f'Orcos x {len(self.lista_orcos)}', font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_orco.place(
            x=230, y=500, width=120, height=30)

        # Imagen Orcos
        self.canv_orco_p2 = Canvas(self.pestaña_inventario, bg='white')
        self.canv_orco_p2.place(x=210, y=350, width=150, height=150)
        self.loadedimage_orco_p2 = ImgRelativeLoad.loadRelImages(
                "../Imagenes/Orco_H.png", 100, 125)
        self.canv_orco_p2.create_image(
                85, 75, image=self.loadedimage_orco_p2)

        # Label subtitulo Hobbit
        self.label_hobbit = ttk.Label(self.pestaña_inventario, text=f'Hobbit x {len(self.lista_hobbits)}', font=("Heebo", 12), background="beige", anchor=CENTER)
        self.label_hobbit.place(
            x=460, y=500, width=120, height=30)

        # Imagen Hobbit
        self.canv_hobbit_p2 = Canvas(self.pestaña_inventario, bg='white')
        self.canv_hobbit_p2.place(x=440, y=350, width=150, height=150)
        self.loadedimage_hobbit_p2 = ImgRelativeLoad.loadRelImages(
                "../Imagenes/Hobbit_H.png", 100, 125)
        self.canv_hobbit_p2.create_image(
                85, 75, image=self.loadedimage_hobbit_p2)

    def selectorImagen(self, ruta, tipo, resizex, resizey):
        if tipo == 'Personaje':
            self.canv_personaje = Canvas(self.pestaña_creacion, bg='white')
            self.canv_personaje.place(x=100, y=150, width=200, height=340)

            self.loadedimage_pj = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_personaje.create_image(
                100, 175, image=self.loadedimage_pj)


        if tipo == 'Montura':
            self.canv_montura = Canvas(self.pestaña_creacion, bg='white')
            self.canv_montura.place(x=520, y=340, width=150, height=150)

            self.loadedimage_mt = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_montura.create_image(75, 75, image=self.loadedimage_mt)

        if tipo == 'Escudo':
            self.canv_escudo = Canvas(self.pestaña_creacion, bg='white')
            self.canv_escudo.place(x=320, y=150, width=150, height=150)

            self.loadedimage_escudo = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_escudo.create_image(
                75, 75, image=self.loadedimage_escudo)

        if tipo == 'Arma':
            self.canv_arma = Canvas(self.pestaña_creacion, bg='white')
            self.canv_arma.place(x=320, y=340, width=150, height=150)

            self.loadedimage_arma = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_arma.create_image(75, 75, image=self.loadedimage_arma)

        if tipo == 'Armadura':
            self.canv_armadura = Canvas(self.pestaña_creacion, bg='white')
            self.canv_armadura.place(x=520, y=150, width=150, height=150)

            self.loadedimage_armadura = ImgRelativeLoad.loadRelImages(
                ruta, resizex, resizey)
            self.canv_armadura.create_image(
                80, 75, image=self.loadedimage_armadura)

    def actualizarEtiquetas(self):
        self.label_humano['text'] = f'Humanos x {len(self.lista_humanos)}'
        self.label_elfo['text'] = f'Elfos x {len(self.lista_elfos)}'
        self.label_enano['text'] = f'Enanos x {len(self.lista_enanos)}'
        self.label_orco['text'] = f'Orcos x {len(self.lista_orcos)}'
        self.label_hobbit['text'] = f'Hobbit x {len(self.lista_hobbits)}'

    def actualizarImagenes(self):
        if self.sv_raza.get() == 'Humano':
            creador_humano = CreadorHumano()
            humano = creador_humano.factory_method(self.radioValue.get())
            self.selectorImagen(humano.getAvatarPath(),
                            "Personaje", 150, 250)
            self.selectorImagen(humano.getEscudoPath(),
                            "Escudo", 100, 100)
            self.selectorImagen(humano.getArmaPath(),
                            "Arma", 100, 100)
            self.selectorImagen(humano.getArmaduraPath(),
                            "Armadura", 100, 100)
            self.selectorImagen(humano.getMonturaPath(),
                            "Montura", 100, 100)

        if self.sv_raza.get() == 'Elfo':
            creador_elfo = CreadorElfo()
            elfo = creador_elfo.factory_method(self.radioValue.get())
            self.selectorImagen(elfo.getAvatarPath(),
                            "Personaje", 150, 250)
            self.selectorImagen(elfo.getEscudoPath(),
                            "Escudo", 100, 100)
            self.selectorImagen(elfo.getArmaPath(),
                            "Arma", 100, 100)
            self.selectorImagen(elfo.getArmaduraPath(),
                            "Armadura", 100, 100)
            self.selectorImagen(elfo.getMonturaPath(),
                            "Montura", 100, 100)
        
        if self.sv_raza.get() == 'Hobbit':
            creador_hobbit = CreadorHobbit()
            hobbit = creador_hobbit.factory_method(self.radioValue.get())
            self.selectorImagen(hobbit.getAvatarPath(),
                            "Personaje", 150, 250)
            self.selectorImagen(hobbit.getEscudoPath(),
                            "Escudo", 100, 100)
            self.selectorImagen(hobbit.getArmaPath(),
                            "Arma", 100, 100)
            self.selectorImagen(hobbit.getArmaduraPath(),
                            "Armadura", 100, 100)
            self.selectorImagen(hobbit.getMonturaPath(),
                            "Montura", 100, 100)

        if self.sv_raza.get() == 'Orco':
            creador_orco = CreadorOrco()
            orco = creador_orco.factory_method(self.radioValue.get())
            self.selectorImagen(orco.getAvatarPath(),
                            "Personaje", 150, 250)
            self.selectorImagen(orco.getEscudoPath(),
                            "Escudo", 100, 100)
            self.selectorImagen(orco.getArmaPath(),
                            "Arma", 100, 100)
            self.selectorImagen(orco.getArmaduraPath(),
                            "Armadura", 100, 100)
            self.selectorImagen(orco.getMonturaPath(),
                            "Montura", 100, 100)
            
        if self.sv_raza.get() == 'Enano':
            creador_enano = CreadorEnano()
            enano = creador_enano.factory_method(self.radioValue.get())
            self.selectorImagen(enano.getAvatarPath(),
                            "Personaje", 150, 250)
            self.selectorImagen(enano.getEscudoPath(),
                            "Escudo", 100, 100)
            self.selectorImagen(enano.getArmaPath(),
                            "Arma", 100, 100)
            self.selectorImagen(enano.getArmaduraPath(),
                            "Armadura", 100, 100)
            self.selectorImagen(enano.getMonturaPath(),
                            "Montura", 100, 100)

    def crearPersonajes(self):
        if self.sv_raza.get() == 'Humano':
            creador_humano = CreadorHumano()
            humano = creador_humano.factory_method(self.radioValue.get())
            for i in range(self.valorspin.get()):
                self.lista_humanos.append(humano.clone())
        elif self.sv_raza.get() == 'Elfo':
            creador_elfo = CreadorElfo()
            elfo = creador_elfo.factory_method(self.radioValue.get())
            for i in range(self.valorspin.get()):
                self.lista_elfos.append(elfo.clone())
        elif self.sv_raza.get() == 'Enano':
            creador_enano = CreadorEnano()
            enano = creador_enano.factory_method(self.radioValue.get())
            for i in range(self.valorspin.get()):
                self.lista_enanos.append(enano.clone())
        elif self.sv_raza.get() == 'Orco':
            creador_orco = CreadorOrco()
            orco = creador_orco.factory_method(self.radioValue.get())
            for i in range(self.valorspin.get()):
                self.lista_orcos.append(orco.clone())
        elif self.sv_raza.get() == 'Hobbit':
            creador_hobbit = CreadorHobbit()
            hobbit = creador_hobbit.factory_method(self.radioValue.get())
            for i in range(self.valorspin.get()):
                self.lista_hobbits.append(hobbit.clone())
        self.actualizarEtiquetas()

    def iniciarInterfaz(self):
        self.raiz.mainloop()
