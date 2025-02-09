# skivy-phone-hint

This plugin will help us fetch User's phone number using Google's Phone-hint API

## Install

```bash
npm install skivy-phone-hint
npx cap sync
```

## API

<docgen-index>

* [`requestHint()`](#requesthint)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### requestHint()

```typescript
requestHint() => Promise<PhoneNumber>
```

Request the phone number dialog picker

**Returns:** <code>Promise&lt;<a href="#phonenumber">PhoneNumber</a>&gt;</code>

**Since:** 1.0.0

--------------------


### Interfaces


#### PhoneNumber

| Prop        | Type                | Description         | Since |
| ----------- | ------------------- | ------------------- | ----- |
| **`phone`** | <code>string</code> | Picket phone number | 1.0.0 |

</docgen-api>
