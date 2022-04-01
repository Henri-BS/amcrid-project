import './styles.css'

function Form() {

    const game = {
        id: 1,
        image: "https://s3.wp.wsu.edu/uploads/sites/609/2019/10/ITSrollout-1188x792.jpg",
        title: "Segurança da Informação",
        answers: 20,
        score: 4.5
    };

    return (
        <>
            <div className="cl-form-container">
                <img className="cl-quest-card-image" src={game.image} alt={game.title} />
                <div className="cl-card-bottom-container">
                    <h3>Segurança da Informação</h3>               
                    <p>Sobre segurança da Informação responda: qual seria...</p>
                    <form className="cl-form">
                        Responder:
                        <div className="form-group cl-form-group">
                            <label htmlFor="email">Informe seu email</label>
                            <input type="email" className="form-control" id="email" />
                        </div>
                        <div className="form-group cl-form-group">
                            <label htmlFor="score">Selecione sua resposta</label>
                            <select className="form-control" id="score">
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                            </select>
                        </div>
                    </form >
                    <div className="cl-form-btn-container">
                        <button type="submit" className="btn btn-primary cl-form-btn">Salvar</button>
                    </div>
                    <button className="btn btn-primary cl-form-btn mt-3">Cancelar</button>
                 </div>
            </div>
            </>
    );
}

export default Form;