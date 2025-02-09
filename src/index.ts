import { registerPlugin } from '@capacitor/core';

import type { PhoneHintPlugin } from './definitions';

const PhoneHint = registerPlugin<PhoneHintPlugin>('PhoneHint', {
  web: () => import('./web').then((m) => new m.PhoneHintWeb()),
});

export * from './definitions';
export { PhoneHint };
