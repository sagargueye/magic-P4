/**
 * MagicP4
 * IUT Lyon 1 - 2016
 */
package model;

/**
 *
 * @author hakkahi / acordier - IUT Lyon 1 - 2016
 */
public class DisappearEffect extends Effect {

    /**
     * TODO
     */
    @Override
    public void playEffect(int line, int column, Game game) {
        
    }
    
     public void playEffect2(int line, int column, Game game) {
      
          game.getBoard().getTileIJ(line-2, column);
    }

}
