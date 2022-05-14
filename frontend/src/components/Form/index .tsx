import './styles.css'

function Form() {

    const quest = {
        id: 1,
        image: "https://s3.wp.wsu.edu/uploads/sites/609/2019/10/ITSrollout-1188x792.jpg",
        title: "Segurança da Informação",
        answers: 20,
        score: 4.5
    };

    return (
        <>
            <div className="cl-form-container">
                <div className="card-form-container">
                    <h3>{quest.title}</h3>
                    <h4>Quais os princípios básicos da Segurança da Informação ?</h4>
                    <form className="cl-form">
                        <div className="form-group cl-form-group">
                               <hr />  
                               <ul className="list-unstyled">
                                <li>A - Confidencialidade, integridade, disponibilidade, autencidade</li>
                                <li>B - Confidencialidade, não repúdio, disponibliidade, concistência</li>
                                <li>C - Escalabilidade, integridade, autenticiadade, criptografia</li>
                                <li>D - Durabilidade, integridade, tolerância, encapsulamento</li>
                                <li>E - Confidencialidade, disponibilidade, autencidade</li>
                                <hr />
                            </ul>
                        </div>
                        <div className="form-group cl-form-group">
                            <label htmlFor="score">Selecione sua resposta</label>
                            <select className="form-control" id="score">
                                <option>A</option>
                                <option>B</option>
                                <option>C</option>
                                <option>D</option>
                                <option>E</option>
                            </select>
                        </div>
                    </form >
                </div>
            </div>
        </>
    );
}

export default Form;