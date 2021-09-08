package br.com.unipar.enums;

import br.com.unipar.codigo.Quarto;
import br.com.unipar.entidades.QuartoCasal;
import br.com.unipar.entidades.QuartoDuplo;
import br.com.unipar.entidades.QuartoIndividual;
import br.com.unipar.entidades.QuartoQuadruplo;
import br.com.unipar.entidades.QuartoTriplo;

/**
 *
 * @author andre
 */
public enum TipoQuarto {
    
    QUARTO_INDIVIDUAL {
        @Override
        public Quarto getTipoQuarto() {
            return new QuartoIndividual();
        }
        
    },
    
    QUARTO_DUPLO {
        @Override
        public Quarto getTipoQuarto() {
            return new QuartoDuplo();
        }  
    },
    
    QUARTO_CASAL {
        @Override
        public Quarto getTipoQuarto() {
            return new QuartoCasal();
        }  
    },
    
    QUARTO_TRIPLO {
        @Override
        public Quarto getTipoQuarto() {
            return new QuartoTriplo();
        }
    },
    
    QUARTO_QUADRUPLO {
        @Override
        public Quarto getTipoQuarto() {
            return new QuartoQuadruplo();
        }
    };
    
    public abstract Quarto getTipoQuarto();   
}
