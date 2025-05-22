import React from 'react';
import { Link } from 'react-router-dom'; // Импортируем Link для перехода
import styles from './categories.module.scss';
import useScrollToHash from '../../hooks/useScrollToHash';
import useScrollToTop from '../../hooks/scrollToTop';

import Header from '../../components/CategoryListingComp/CategoriesListingHeaderComp/CategoriesHeader';
import Manicure from '../../components/CategoryListingComp/ManicureListing/ManicureListing';
import Lashes from '../../components/CategoryListingComp/LashesListing/LashesListing';
import Brows from '../../components/CategoryListingComp/BrowsListing/BrowsListing';
import Hair from '../../components/CategoryListingComp/HairListing/HairService';
import OtherService from '../../components/CategoryListingComp/OtherServiceListing/OtherService';

const Services: React.FC = () => {
  useScrollToHash(); 
  useScrollToTop();
  return (
    <section>
      <Header/>
      <div className={styles.services}>
        <div id="manicure">
          <Manicure />
        </div>
        <div id="lashes">
          <Lashes />
        </div>
        <div id="brows">
          <Brows />
        </div>
        <div id="hair">
          <Hair />
        </div>
        <div id="other">
          <OtherService />
        </div>
      </div>
    </section>
  );
};

export default Services;
