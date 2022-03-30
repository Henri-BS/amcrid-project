import "./styles.css";

import IGithub from "assets/img/git.svg";
import ILinkedin from "assets/img/linked.svg";
import IGmail from "assets/img/gmail.svg";

function Footer() {
    return (
        <div className="footer-max-container">
            <div className="footer-container">
                <div className="row">
                    <div className="footer-grid-container col-sm-12 col-md-4 mt-48 mx-16">
                        <ul className="list-unstyled mx-10">
                            <h3>Site</h3>
                            <hr />
                            <li className="mb-2">Sobre Nós</li>
                            <li className="mb-2">Perguntas Frequentes</li>
                            <li className="mb-2">Mapa do Site</li>
                            <li className="mb-2">Novidades</li>
                        </ul>
                    </div>
                    <div className="footer-grid-container col-sm-12 col-md-4 mt-20 mx-16 ">
                        <ul className="list-unstyled">
                            <h3>Conta</h3>
                            <hr />
                            <li className="mb-2">Cadastro</li>
                            <li className="mb-2">Login</li>
                            <li className="mb-2">Receber notificações por Email</li>
                            <li className="mb-2">Privacidade e Segurança</li>
                        </ul>
                    </div>
                    <div className="footer-grid-container col-sm-12 col-md-4 mt-48  mx-16">
                        <ul className="list-unstyled">
                            <h3>Contato</h3>
                            <hr />
                            <div className="row mb-3 mt-48 mx-16 ">
                                <a href="https://github.com/Henri-BS" color="inherit">
                                    <img className='footer-logo' src={IGithub} alt='logo' />
                                    /Github
                                </a>
                            </div>
                            <div className="row mb-3 mt-48 mx-16 ">
                                <a href="https://www.linkedin.com/in/h-b-santos-1758351a3/" color="inherit">
                                    <img className='footer-logo' src={ILinkedin} alt='logo' />
                                    /LinkedIn
                                </a>
                            </div>
                            <div className="row mb-3 mt-20 mx-16 ">
                                <a href="mailto:rickalmeida720@gmail.com" color="inherit">
                                    <img className='footer-logo' src={IGmail} alt='logo' />
                                    /Gmail
                                </a>
                            </div>
                        </ul>
                    </div>
                    <hr />
                </div>
                <div className="footer-base-container">
                    <div className="row">
                        <div className="col-2">

                        </div>
                        <div className="footer-base-text-container col-10">
                            <h5>Todos os direitos reservados</h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>


    );
}
export default Footer;
