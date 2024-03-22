package com.example.Studentisimulazionecheckpoint3.entity;

import javax.persistence.*;


@Entity
public class Studenti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cognome;
    public Studenti(Long id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Studenti() {
    }
    public Long getId() {
            return id;
        }

    public void setId(Long id) {
            this.id = id;
        }

    public String getNome() {
            return nome;
        }

    public void setNome(String nome) {
            this.nome = nome;
        }

    public String getCognome() {
            return cognome;
        }

    public void setCognome(String cognome) {
            this.cognome = cognome;
        }
}
