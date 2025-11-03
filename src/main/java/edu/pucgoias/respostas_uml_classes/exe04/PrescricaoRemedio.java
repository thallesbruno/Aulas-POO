package edu.pucgoias.respostas_uml_classes.exe04;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class PrescricaoRemedio {
    String usuario;
    Date dataInicio;
    int qtdDias;
    int qtdVezesDia;
    float dosagem;
    Remedio remedio;
    ArrayList<HorarioRemedio> planilhaHorario;

    void sugerirHorario(){}
    void exibirPlanilhaHorarios(Date dataReferencia){}
}
