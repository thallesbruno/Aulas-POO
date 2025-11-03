package edu.pucgoias.respostas_uml_classes.exe06;

import java.util.ArrayList;

public class Comanda {
    int numero;
    float valorTotal; // calculado
    ArrayList<ItemComanda> itens = new ArrayList<ItemComanda>();

    void registrarItem(ItemComanda item){}
    void fecharComanda(){}
}
