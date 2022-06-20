import "./styles.css"
function QuestScore() {

    const score = 3.5;
    const totalCorrect = 13;

    return (
        <div className="cl-info-container">
            <p className="cl-info-value">{score > 0 ? score.toFixed(1) : '-'} </p>
            <p className="cl-info-count">{totalCorrect} respostas corretas</p>
        </div>
    );
}

export default QuestScore;