import './styles.css'


function RankingDetails() {

    const top = {
        id: 1,
        user1: "https://ih1.redbubble.net/image.1426571880.2339/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg",
        user2: "https://i.pinimg.com/originals/68/78/ba/6878ba09cc8a99383f70a00451b57318.png",
        user3: "https://i.pinimg.com/originals/fc/f2/9b/fcf29b175770dba5aa539c82fd3b064e.jpg",
        
    };

    return (
        
            <div className="top-user-container">
                <article className="top-user-card">
                    <div className="top-user-card-image">
                    <img src={top.user2} alt="user2" />
                    </div>

                    <div className="top-user-card-content">
                        <span className="u-text-placeholder w-25"></span>
                        <span className="u-text-placeholder w-75"></span>
                        <span className="u-text-placeholder w-50"></span>
                    </div>
                </article>

                <article className="top-user-card">
                    <div className="top-user-card-image">
                    <img src={top.user1} alt="user1" />
                    </div>

                    <div className="top-user-card-content">
                        <span className="u-text-placeholder w-25"></span>
                        <span className="u-text-placeholder w-75"></span>
                        <span className="u-text-placeholder w-50"></span>
                    </div>
                </article>

                <article className="top-user-card">
                    <div className="top-user-card-image">
                    <img src={top.user3} alt="user3" />
                    </div>

                    <div className="top-user-card-content">
                        <span className="u-text-placeholder w-25"></span>
                        <span className="u-text-placeholder w-75"></span>
                        <span className="u-text-placeholder w-50"></span>
                    </div>
                </article>


                </div>
    );

}
            export default RankingDetails;
