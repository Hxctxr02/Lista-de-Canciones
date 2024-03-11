package com.appwithspring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    /**
     * @param model
     * @return
     */
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Lista de Canciones");

        // Crear una lista de canciones
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("It's A Fine Day", "Pixel Hood", "It's A Fine Day"));
        songs.add(new Song("Stuck in My Head", "Undefeated", "Not Defeated"));
        songs.add(new Song("Tu Coreografía", "Indios", "Gamba - Los Hits"));
        songs.add(new Song("After Dark", "Mr. Kitty", "Time"));
        songs.add(new Song("ICEWHORE!", "Lumi Athena", "ICEWHORE!"));
        songs.add(new Song("Party Monster", "The Weekend", "Starboy"));
        songs.add(new Song("Bad Dub - Dub", "Flix", "Midnight Skank"));
        songs.add(new Song("Bass Demon", "Code Crime", "Gearbox Presents Lockdown"));
        songs.add(new Song("Loverboy", "A-Wall", "Loverboy"));
        songs.add(new Song("El Rey del Fango", "Sid MSC", "El Rey del Fango"));
        songs.add(new Song("Go!", "MoonDelty", "Go!"));
        songs.add(new Song("Insomnia", "KAS:ST", "Road to Nowhere"));
        songs.add(new Song("Crystal Meth", "SpriTEKK", "Crystal Meth"));
        songs.add(new Song("1004 KM", "Junior H", "$ad Boyz 4 Life"));
        songs.add(new Song("Close 2 end", "myle$", "Close 2 end"));
        songs.add(new Song("The Perfect Girl", "Mareux", "The perfect Girl"));
        songs.add(new Song("NOW", "Tiefundton", "NOW"));
        songs.add(new Song("Shed My Skin", "REDZED", "Shed My Skin"));
        songs.add(new Song("WASTE", "Kxllswxtch", "WASTE"));
        songs.add(new Song("Nightcall", "Kavinsky", "Nightcall"));
        // Agregar más canciones...

        // Agregar la lista de canciones al modelo
        model.addAttribute("songs", songs);

        return "details";
    }
}
