import { ReactComponent as Arrow } from 'assets/img/arrow.svg';
import { Page } from 'types/page';
import './styles.css';

type Props = {
    page: Page;
    onChange: Function;
}

function Pagination({ page, onChange }: Props) {

    return (
        <div className="cl-pagination-container">
            <div className="cl-pagination-box">
                <button className="cl-pagination-button"
                    disabled={page.first}
                    onClick={() => onChange(page.number - 1)}>
                    <Arrow />
                </button>

                <p>{`${page.number + 1} de ${page.totalPages}`}</p>

                <button className="cl-pagination-button"
                    disabled={page.last}
                    onClick={() => onChange(page.number + 1)} >
                    <Arrow className="cl-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}

export default Pagination;

export function UserProfilePagination({ page, onChange }: Props) {

    return (
        <div className="cl-pagination-container">
            <div className="cl-pagination-box">
                <button className="cl-pagination-button"
                    disabled={page.first}
                    onClick={() => onChange(page.number - 1)}>
                    <Arrow />
                </button>

                <p>{`${page.number + 1} de ${page.totalPages}`}</p>

                <button className="cl-pagination-button"
                    disabled={page.last}
                    onClick={() => onChange(page.number + 1)} >
                    <Arrow className="cl-flip-horizontal" />
                </button>
            </div>
        </div>
    );
}