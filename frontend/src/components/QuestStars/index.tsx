import { ReactComponent as StarFull} from 'assets/img/star1.svg';
import { ReactComponent as StarHalf} from 'assets/img/star2.svg';
import { ReactComponent as StarEmpty} from 'assets/img/star3.svg';

function QuestStars() {
    return (
<div className="cl-stars-container">
<StarFull />
<StarFull />
<StarFull />
<StarHalf />
<StarEmpty />
</div>
    );
}

export default QuestStars;