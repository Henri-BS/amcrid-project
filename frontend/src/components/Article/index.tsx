import './styles.css';

const post = {
    id: 1,
    title: 'Princípios Básicos da Segurança da Informação',
    summary: '"Porque é importante criar um esforço para seguir e manter os quatro princípios da Segurança da Informação e como eles influenciam na segurança e na privacidade nos meios digitais e na vida real ?"',
    image: "https://s3.wp.wsu.edu/uploads/sites/609/2019/10/ITSrollout-1188x792.jpg",
    createdBy: "Big Hunt",
    createdDate: "11/04/2020"
};

export function ArticlePost() {
    return (
        <>
            <div className="row ">
                <div className="col-xl-7 article-header">
                    <img className="article-image" src={post.image} alt={post.title} />
                    <div className="article-summary">
                        <i>{post.summary}</i>
                    </div>
                </div>
                <div className="col-xl-5 article-card-info">
                    <h2 className="mb-3">{post.title}</h2>
                    <ul className="list-unstyled">
                        <li><b>Data de publicação: </b>{post.createdDate}</li>
                        <li><b>Autor: </b>{post.createdBy}</li>
                    </ul>

                </div>
            </div>


            <div className="article-content">
                <p>É imprescindível que as empresas protejam os dados dos seus clientes com todo o afinco que puderem. Na era digital, os dados são tão importantes que milhares de ataques acontecem diariamente. O Brasil se tornou o segundo maior alvo mundial de ciberataques, segundo um estudo da Netscout. Por isso, as empresas devem sempre se preocupar em gerenciar riscos e proteger as informações de acesso não autorizado, vazamentos, alterações, invasões e perdas.</p> <p> As ameaças à segurança da informação podem acontecer de diversas formas, desde ataques ransomwares a erros humanos. Dessa forma, a segurança da informação se baseia em quatro pilares para proteger as informações e dados: confidencialidade, integridade, disponibilidade e autenticidade.</p>
            </div>
        </>
    )
}

export function ArticleChapter() {
    return (
        <>
            <div className="article-container">
                <div className="article-content">
                    <h2>"Princípios Básicos da Segurança da Informação"</h2>
                    <p>Neste capítulo você será apresentado a missões que iram testar os seus conhecimentos a cerca dos princípios básicos da segurança da informação, para  executar este capítulo com êxito é nescessário compreender as características de cada um dos príncipios.</p>
                </div>
            </div>
        </>
    );
}

