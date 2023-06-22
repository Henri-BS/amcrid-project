import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import Dropdown from 'components/shared/Dropdown';
import IProf from "assets/img/prof-img.png";
import './styles.css';
import { UserAddForm } from 'components/form/UserForm';

function Navbar() {
  return (
    <>
      <nav className='navbar'>
        <ul className={'nav-menu'}>
          <li className='nav-item'>
            <Link to={"/"} className='nav-links'>
              Home <i className={"fas fa-home"} />
            </Link>
          </li>
          <MenuExplore />
          <MenuUser />
        </ul>
      </nav>

      <div className="modal fade" role="dialog" id="addUserModal">
        <div className="modal-dialog" role="document">
          <div className="modal-content">
            <UserAddForm />
          </div>
        </div>
      </div>
    </>
  );

  function MenuUser() {
    const [click, setClick] = useState(false);
    const [dropdown, setDropdown] = useState(false);

    const handleClick = () => setClick(!click);
    const closeMobileMenu = () => setClick(false);

    const onMouseEnter = () => {
      if (window.innerWidth < 960) {
        setDropdown(false);
      } else {
        setDropdown(true);
      }
    };

    const onMouseLeave = () => {
      if (window.innerWidth < 960) {
        setDropdown(false);
      } else {
        setDropdown(false);
      }
    };
    return (
      <>
        <ul className={click ? 'nav-menu-m active' : 'nav-menu-m'}>
          <li className='profile-nav' >
            <Link to='/profile/1' onClick={closeMobileMenu}>
              <img className='nav-links-image' src={IProf} alt='profile' />
            </Link>
            <h2 onClick={closeMobileMenu}><i className={"fas fa-times"} /></h2>
          </li>
          <li>
            <Link to='/' className='nav-links-mobile' onClick={closeMobileMenu}>
              Home
            </Link>
          </li>

          <li>
            <Link
              to='/campaign-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Minhas Campanhas
            </Link>
          </li>
          <li>
            <Link
              to='/post-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Minha Biblioteca
            </Link>
          </li>
          <li>
            <Link
              to='/user-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Seguindo
            </Link>
          </li>
          <li onMouseEnter={onMouseEnter} onMouseLeave={onMouseLeave}>
            <Link to='/' className='nav-links-mobile' onClick={closeMobileMenu}>
              Explorar <i className='fas fa-caret-down' />
            </Link>
            {dropdown && <Dropdown />}
          </li>
        </ul>

        <li className='nav-item'>
          <div className='nav-links' onClick={handleClick}>
            Perfil <i className={"fas fa-user"} />
          </div>
        </li>
      </>
    );
  }

  function MenuExplore() {
    const [click, setClick] = useState(false);
    const [dropdown, setDropdown] = useState(false);

    const handleClick = () => setClick(!click);
    const closeMobileMenu = () => setClick(false);

    const onMouseEnter = () => {
      if (window.innerWidth < 960) {
        setDropdown(false);
      } else {
        setDropdown(true);
      }
    };

    const onMouseLeave = () => {
      if (window.innerWidth < 960) {
        setDropdown(false);
      } else {
        setDropdown(false);
      }
    };
    return (
      <>
        <ul className={click ? 'nav-menu-m active' : 'nav-menu-m'}>
          <li className='profile-nav' >
          <button className='cl-btn nav-links' data-bs-target="#addUserModal" data-bs-toggle="modal">
              Sing Up
            </button>
            <h2 onClick={closeMobileMenu}><i className={"fas fa-times"} /></h2>
          </li>
          <li>
            <Link to='/' className='nav-links-mobile' onClick={closeMobileMenu}>
              Home
            </Link>
          </li>

          <li>
            <Link
              to='/campaign-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Lista de Campanhas
            </Link>
          </li>
          <li>
            <Link
              to='/post-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Lista de Publicações
            </Link>
          </li>
          <li>
            <Link
              to='/user-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Lista de Usuários
            </Link>
          </li>
          <li>
            <Link
              to='/' className='nav-links-mobile' onClick={closeMobileMenu} >
              Fórum
            </Link>
          </li>
          <li onMouseEnter={onMouseEnter} onMouseLeave={onMouseLeave}>
            <Link to='/' className='nav-links-mobile' onClick={closeMobileMenu}>
              Explorar <i className='fas fa-caret-down' />
            </Link>
            {dropdown && <Dropdown />}
          </li>
          <li>

          </li>
        </ul>
        <li className='nav-item'>
          <div className='nav-links' onClick={handleClick}>
            Explorar <i className={"fas fa-bars"} />
          </div>
        </li>
      </>
    );
  }
}

export default Navbar;

