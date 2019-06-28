package QueOutfit.SugerenciasElementos.Reglas;

import QueOutfit.PrendasElementos.ETipo;
import QueOutfit.PrendasElementos.Prenda;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Filtro {
        Set <Regla> daRules;

        private Filtro() {
        daRules= new HashSet<>();
        iniciar();
        }

        private static class SingletonHolder {
            private static final Filtro INSTANCE = new Filtro();
        }

        public static Filtro getInstance() {
            return SingletonHolder.INSTANCE;
        }

        public void agregarRegla(Regla regla){
            daRules.add(regla);
        }

        public void removerRegla(Regla regla){
            daRules.remove(regla);
        }

        public boolean match(Set<Prenda>prendas){
            return  daRules.stream().allMatch(regla -> regla.tieneSentido(prendas));
        }

        public void iniciar(){
            Regla noRepeticionTipos= new ReglaTiposRepetidos();
            Set<ETipo> sweateryBuzo= new HashSet<ETipo>(Arrays.asList(new ETipo[]{ETipo.SWEATER,ETipo.BUZO}));
            Regla combinacionInvalidaSweaterYBuzo=new ReglaTiposCombinacionesInvalidas(sweateryBuzo);
            Set<ETipo> zapatosYGorro = new HashSet<ETipo>(Arrays.asList(new ETipo[]{ETipo.ZAPATOS,ETipo.GORRO}));
            Regla combinacionInvalidazapatosYGorro=new ReglaTiposCombinacionesInvalidas(zapatosYGorro);
        }

    }