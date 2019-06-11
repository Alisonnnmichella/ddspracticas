package QueOutfit.PrendasElementos;

  public enum NivelAbrigo {
        NULO(0), LIVIANO(1), MEDIANO(2), PESADO(3);

        int puntos;

        NivelAbrigo(int puntos) {
            this.puntos = puntos;
        }

        public int getPuntos() {
            return puntos;
        }
    }
