import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import Dropdown from 'components/shared/Dropdown';
import IProf from "assets/img/prof-img.png";
import './styles.css';
import { UserAddForm } from 'components/form/UserForm';



function Navbar() {
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
      <nav className='navbar'>
        <div className='menu-icon' onClick={handleClick}>
          <i className={click ? 'fas fa-times' : 'fas fa-bars'} />
        </div>
        <ul className={click ? 'nav-menu-m active' : 'nav-menu-m'}>
          <li>
            <Link to='/profile/1' className='profile-nav' onClick={closeMobileMenu}>
              <img className='nav-links-image' src={IProf} alt='profile' />
            </Link>
          </li>
          <li>
            <Link to='/' className='nav-links-mobile' onClick={closeMobileMenu}>
              Home
            </Link>
          </li>

          <li>
            <Link
              to='/chapter-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Lista de Capítulos
            </Link>
          </li>
          <li>
            <Link
              to='/post-list' className='nav-links-mobile' onClick={closeMobileMenu} >
              Lista de Artigos
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
              to='/sign-up' className='nav-links-mobile' onClick={closeMobileMenu} >
              Sign Up
            </Link>
          </li>
        </ul>
        <ul className={'nav-menu'}>
          <li className='nav-item'>
            <Link to='/' className='nav-links' onClick={closeMobileMenu}>
              Home
            </Link>
          </li>

          <li className='nav-item' onMouseEnter={onMouseEnter} onMouseLeave={onMouseLeave}>
            <Link to='/' className='nav-links' onClick={closeMobileMenu}>
              Explorar <i className='fas fa-caret-down' />
            </Link>
            {dropdown && <Dropdown />}
          </li>

          <li className='nav-item'>
            <button className='cl-btn nav-links' data-bs-target="#addUserModal" data-bs-toggle="modal">
              Sing Up
            </button>
          </li>
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
}

export default Navbar;

