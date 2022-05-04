import "./styles.css";

import IGithub from "assets/img/git.svg";
import ILinkedin from "assets/img/linked.svg";
import IGmail from "assets/img/gmail.svg";
import IWLogo from "assets/img/w-logo.svg";
import { Link } from "react-router-dom";

function Footer() {
    return (
        <div className="footer-max-container ">
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
                                <Link to="/">
                                    <img className='footer-img' src={IGithub} alt='logo' />
                                    /Github
                                </Link>
                            </div>
                            <div className="row mb-3 mt-48 mx-16 ">
                                <Link to="/">
                                    <img className='footer-img' src={ILinkedin} alt='logo' />
                                    /LinkedIn
                                </Link>
                            </div>
                            <div className="row mb-3 mt-20 mx-16 ">
                                <Link to="/">
                                    <img className='footer-img' src={IGmail} alt='logo' />
                                    /Gmail
                                </Link>
                            </div>
                        </ul>
                    </div>
                    <hr />
                </div>
                <div className="footer-base-container">
                    <div className="row">
                        <div className="footer-logo col-3">
                            <img src={IWLogo} alt='logo' />

                        </div>
                        <div className="footer-base-text-container col-9">
                            <h5>ClassLock.Inc</h5>
                            todos os direitos reservados.
                        </div>
                    </div>
                </div>
            </div>
        </div>


    );
}
export default Footer;
