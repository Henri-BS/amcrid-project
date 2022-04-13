import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import './styles.css';


function Pagination(){

    return(
<div className="cl-pagination-container">
    <div className="cl-pagination-box">
        <button className="cl-pagination-button" disabled={true}>
            <Arrow />
        </button>
        <p>{`${1} de ${3}`}</p>
        <button className="cl-pagination-button" disabled={false}>
            <Arrow className="cl-flip-horizontal" />
        </button>
    </div>
</div>
    );
}

export default Pagination;

export function PaginationLeft(){
    return(
        <div className="cl-pagination-one-container">
    <div className="cl-pagination-one-box">
        <button className="cl-pagination-one-button" disabled={true}>
            <Arrow />
        </button>
        </div>
        </div>
    );
}

export function PaginationRight(){
    return (
    <div className="cl-pagination-one-container ">
    <div className="cl-pagination-one-box">
    <button className="cl-pagination-one-button" disabled={false}>
            <Arrow className="cl-flip-horizontal" />
        </button>
    </div>
</div>
);
}