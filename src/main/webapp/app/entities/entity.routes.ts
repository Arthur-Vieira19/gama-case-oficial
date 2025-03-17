import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'casegamaooficialApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'meta',
    data: { pageTitle: 'casegamaooficialApp.meta.home.title' },
    loadChildren: () => import('./meta/meta.routes'),
  },
  {
    path: 'aluno',
    data: { pageTitle: 'casegamaooficialApp.aluno.home.title' },
    loadChildren: () => import('./aluno/aluno.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
