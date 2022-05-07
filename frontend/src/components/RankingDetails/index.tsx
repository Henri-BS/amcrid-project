import './styles.css'


function RankingDetails() {

    const top = {
        id: 1,
        user1: "https://ih1.redbubble.net/image.1426571880.2339/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg",
        user2: "https://i.pinimg.com/originals/68/78/ba/6878ba09cc8a99383f70a00451b57318.png",
        user3: "https://th.bing.com/th/id/R.5593ca2aba87921ccad72577bc99c185?rik=2tk36cOXWfPWrQ&riu=http%3a%2f%2f2.bp.blogspot.com%2f-VjDMK_Ype-s%2fUPRMcaQ93qI%2fAAAAAAAABY0%2fmU_Xji0dzsI%2fs1600%2fpcbots%2bhacker.jpg&ehk=VGwsqR%2fc8SIdf0R3rgpbzhLzLulLNBioHGu8%2bWtWN0g%3d&risl=&pid=ImgRaw&r=0",
        answers: 20,
    };

    return (
        
            <div className="top-user-container">
                    <img className="position-relative d-inline-block col-3 col-md-3 mr-3 mr-md-0 flex-shrink-0" src={top.user2} alt="user2" />
                    <img className="position-relative d-inline-block col-5 col-md-5 mr-7 mr-md-0 flex-shrink-0" src={top.user1} alt="user1" />
                    <img className="position-relative d-inline-block col-3 col-md-3 mr-3 mr-md-0 flex-shrink-0" src={top.user3} alt="user3" />
                </div>
    );

}
            export default RankingDetails;
