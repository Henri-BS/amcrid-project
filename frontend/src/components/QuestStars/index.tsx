import { ReactComponent as StarFull} from 'assets/img/star1.svg';
import { ReactComponent as StarHalf} from 'assets/img/star2.svg';
import { ReactComponent as StarEmpty} from 'assets/img/star3.svg';

function GameStars() {
    return (
<div className="gmnc-stars-container">
<StarFull />
<StarFull />
<StarFull />
<StarHalf />
<StarEmpty />
</div>
    );
}

export default GameStars;