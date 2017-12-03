package bomberman.Gameobjects.blocks;

import bomberman.grid.position.GridPosition;

public class HardBlock extends Blocks {

    public HardBlock(GridPosition pos){
        super(pos, BlockType.HARDBLOCK);
    }

    @Override
    public void setDestroyed() {
        //this type of block never gets destroyed

    }
}
