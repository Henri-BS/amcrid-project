import GameStars from "components/GameStars";
import "./styles.css"
function QuestScore() {

    const score = 3.5;
    const count = 13;

    return (
        <div className="cl-info-container">
            <p className="cl-info-value">{score > 0 ? score.toFixed(1) : '-'} </p>
            <GameStars />
            <p className="cl-info-count">{count} avaliações</p>
        </div>
    );
}

export default QuestScore;